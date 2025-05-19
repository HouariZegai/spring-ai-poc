package org.zegai.springaipoc.prompt;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromptController {

    private final PromptService promptService;

    public PromptController(PromptService promptService) {
        this.promptService = promptService;
    }

    @PostMapping("/prompts")
    public ResponseEntity<PromptResDto> sendPrompt(@RequestBody PromptReqDto prompt) {
        return ResponseEntity.status(201).body(promptService.sendPrompt(prompt));
    }
}
