package com.sid.wordanalyser;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AnalyseController {

    @GetMapping("/wordanalyser/analyse")
    public ResponseEntity<Object> returnTest(@RequestParam(name="word", required=false, defaultValue="") String wordRequest) {
        return ResponseEntity.ok(new AnalyseResponse(wordRequest));
    }

}
