package com.luisske.memberManager;

import com.luisske.memberManager.service.AnalyzationService;
import com.luisske.memberManager.service.CalendarService;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class MemberManager {

    public static void main(String[] args) throws GeneralSecurityException, IOException {
        AnalyzationService analyzationService = new AnalyzationService();
        CalendarService calendarService = new CalendarService();

        analyzationService.readInputFile();
        calendarService.getUpcomingEvents();
    }
}
