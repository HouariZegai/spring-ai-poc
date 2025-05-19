package org.zegai.springaipoc.prompt;

public interface PromptService {
    PromptResDto sendPrompt(PromptReqDto prompt);
}
