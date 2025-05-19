# Spring AI Proof of Concept

This project demonstrates the integration of OpenAI's capabilities with Spring Boot applications using the Spring AI library.

## Overview

Spring AI POC is a simple REST API that allows users to send prompts to OpenAI and receive AI-generated responses. It serves as a proof of concept for how Spring AI can be used to integrate AI capabilities into Spring Boot applications.

## Technologies Used

- Java 21
- Spring Boot 3.4.5
- Spring AI 1.0.0-RC1
- OpenAI API

## Prerequisites

- JDK 21 or higher
- Gradle
- OpenAI API key

## Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/houarizegai/spring-ai-poc.git
   cd spring-ai-poc
   ```

2. Set your OpenAI API key as an environment variable:
   ```bash
   # For Windows
   set OPENAI_API_KEY=your_api_key_here
   
   # For Linux/macOS
   export OPENAI_API_KEY=your_api_key_here
   ```

3. Build the project:
   ```bash
   ./gradlew build
   ```

4. Run the application:
   ```bash
   ./gradlew bootRun
   ```

The application will start on port 8080 by default.

## Usage

The API exposes a single endpoint for sending prompts to the AI model:

### Send a Prompt

**Endpoint:** `POST /prompts`

**Request Body:**
```json
{
  "prompt": "Your prompt text here"
}
```

**Response:**
```json
{
  "content": "AI-generated response will appear here"
}
```

### Example using cURL

```bash
curl -X POST http://localhost:8080/prompts \
  -H "Content-Type: application/json" \
  -d '{"prompt":"Tell me a short joke about programming"}'
```

### Example using HTTPie

```bash
http POST http://localhost:8080/prompts prompt="Tell me a short joke about programming"
```

## Project Structure

- `PromptController`: REST controller that handles HTTP requests
- `PromptService`: Interface defining the service contract
- `PromptServiceImpl`: Implementation of the service using Spring AI's ChatClient
- `PromptReqDto`: Data Transfer Object for the request
- `PromptResDto`: Data Transfer Object for the response

## Configuration

The application is configured to use OpenAI as the AI provider. The API key is read from the `OPENAI_API_KEY` environment variable.

## License

[MIT License](LICENSE)