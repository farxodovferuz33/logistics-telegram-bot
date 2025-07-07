package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            MyBot bot = new MyBot();
            botsApi.registerBot(bot);
            bot.startScheduler();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
