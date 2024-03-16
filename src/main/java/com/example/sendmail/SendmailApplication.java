package com.example.sendmail;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendmailApplication {

	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(SendmailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
//		emailSenderService.sendDimpleEmail("joyebodw@gmail.com",
//			"Dear New Employee,\n" +
//					"\n" +
//					"We are excited to welcome you to our team today. We will meet you in the lobby of our building at any Time. Please remember to bring your ID.\n" +
//					"\n" +
//					"When you arrive, you’ll be shown your office/workstation and introduced to other members of your team. We want you to feel comfortable in your work environment so please let us know if there is anything specific that you need.\n" +
//					"\n" +
//					"Your colleagues look forward to meeting you, and we have planned a first-day lunch for you to get to know each other.\n" +
//					"\n" +
//					"We are also preparing a robust onboarding schedule for you so you will quickly feel at home. Your onboarding schedule will be sent to you shortly. Once you’ve had a chance to review the schedule, please let us know if you have any requested adjustments.\n" +
//					"\n" +
//					"We look forward to working with you—welcome to the team!\n" +
//					"\n" +
//					"Sincerely,\n" +
//					"New Employee",
//			"Welcome to Dana");
//
//			emailSenderService.sendEmailWithAttachment("joyebodw@gmail.com",
//                    """
//                            Dear New Employee,
//
//                            We are excited to welcome you to our team today. We will meet you in the lobby of our building at any Time. Please remember to bring your ID.
//
//                            When you arrive, you’ll be shown your office/workstation and introduced to other members of your team. We want you to feel comfortable in your work environment so please let us know if there is anything specific that you need.
//
//                            Your colleagues look forward to meeting you, and we have planned a first-day lunch for you to get to know each other.
//
//                            We are also preparing a robust onboarding schedule for you so you will quickly feel at home. Your onboarding schedule will be sent to you shortly. Once you’ve had a chance to review the schedule, please let us know if you have any requested adjustments.
//
//                            We look forward to working with you—welcome to the team!
//
//                            Sincerely,
//                            New Employee""",
//				"Welcome to Dana",
//					"C:\\Users\\JOHNSON-OYEBODE\\Downloads\\welcometotheteam.jpg");

		emailSenderService.sendHtmlEmail("Johnson","joyebodw@gmail.com",
				"Welcome to Dana");

	}
}
