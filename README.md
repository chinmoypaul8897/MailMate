# MailMate - AI-Powered Email Reply Extension

MailMate is an AI-powered browser extension that helps users generate professional and customized email replies directly within their email client. By leveraging the power of artificial intelligence, MailMate offers an intuitive way to respond to emails in a personalized, professional, and timely manner. 

This project includes a Chrome extension to interact with Gmail and a Spring Boot backend to generate email replies using AI.

## Features

- **Automatic Email Reply Generation:** MailMate analyzes the content of an email and generates a suitable reply based on the provided tone (Professional, Casual, or Friendly).
- **Gmail Integration:** The extension works directly within Gmail, adding a button that generates the reply when clicked.
- **Tone Customization:** Users can specify the tone (Professional, Casual, or Friendly) of the generated reply.
- **Clipboard Support:** The generated reply can be easily copied to the clipboard with a click of a button.
- **Error Handling:** Users are notified in case of any errors during the email generation process.

## Tech Stack

### Frontend
- **React**: A JavaScript library for building user interfaces, used to create the email reply generation form.
- **Material UI**: A popular React UI framework for modern and responsive design components.
- **Axios**: A promise-based HTTP client for making API requests from the React frontend.

### Backend
- **Spring Boot**: A Java-based framework used to create the RESTful API that interacts with the AI service for generating email replies.
- **WebClient**: A non-blocking, reactive HTTP client used in the backend to communicate with the AI API.
- **Gemini AI API**: An AI service used to generate email replies based on user input.

### Extension
- **Manifest V3**: A specification for Chrome extensions, defining the extension's metadata, permissions, and content scripts.
- **Content Scripts**: JavaScript and CSS used to inject the "AI Reply" button into the Gmail compose window.

## How to Set Up

### Frontend Setup (React)

1. Clone the repository:

    ```bash
    git clone https://github.com/chinmoypaul8897/MailMate.git
    cd MailMate/frontend
    ```

2. Install dependencies:

    ```bash
    npm install
    ```

3. Start the React development server:

    ```bash
    npm start
    ```

4. Open the app in your browser by navigating to [http://localhost:3000](http://localhost:3000).

### Backend Setup (Spring Boot)

1. Clone the repository:

    ```bash
    git clone https://github.com/chinmoypaul8897/MailMate.git
    cd MailMate/backend
    ```

2. Build the Spring Boot project:

    ```bash
    ./mvnw clean install
    ```

3. Run the Spring Boot application:

    ```bash
    ./mvnw spring-boot:run
    ```

4. The backend will be available at `http://localhost:8080`.

### Chrome Extension Setup

1. Open Chrome and go to `chrome://extensions/`.
2. Enable "Developer mode" and click "Load unpacked."
3. Select the `extension/` directory in the cloned repository.

### Configuring API

To use the AI service for generating email replies, you'll need to configure the API key for the Gemini AI service:

1. In the `backend/application.properties` file, set the following:

    ```properties
    gemini.api.url=http://your-gemini-api-url/
    gemini.api.key=your-api-key
    ```

2. Make sure your backend is running and is accessible from the frontend.

## Usage

1. **Compose an Email in Gmail:** Open Gmail and click on the Compose button to create a new email.
2. **Generate Reply:** After writing the email content, click the "AI Reply" button in the toolbar to generate a reply based on the tone you have selected.
3. **Copy the Reply:** Once the reply is generated, you can copy it to the clipboard or paste it directly into the email compose box.

### Tone Options
- **Professional**: A formal and business-oriented response.
- **Casual**: A more relaxed, informal tone.
- **Friendly**: A warm and approachable tone.

## Demo Video

https://github.com/user-attachments/assets/7b7b1de7-19b3-4f16-a53a-6e2b2ebded6d

https://github.com/user-attachments/assets/7a5540f3-5aa7-4808-bb43-c57c2b0cd3c9

## License

MailMate is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.

## Contact

For any questions or support, please contact the project maintainers at [chinmoypaul8897@gmail.com](mailto:chinmoypaul8897@gmail.com).

---

Thanks for using MailMate! We hope it helps streamline your email workflow. Happy emailing!
