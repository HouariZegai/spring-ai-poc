package org.zegai.springaipoc.prompt;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class PromptServiceImpl implements PromptService {

    private final ChatClient chatClient;

    public PromptServiceImpl(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @Override
    public PromptResDto sendPrompt(PromptReqDto prompt) {
        return new PromptResDto(chatClient.prompt(prompt.prompt()).call().content());
    }
}
