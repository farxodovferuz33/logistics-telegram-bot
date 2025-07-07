package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.io.File;
import java.net.InetAddress;
import java.util.Timer;
import java.util.TimerTask;

public class MyBot extends TelegramLongPollingBot {

    private final String botUsername = "@waygodriversbot";
    private final String botToken = "7250075439:AAEwx1Gmk74lLi-tIq8lzlqHdUMRdwFVP4I";
    private final String chatId = "-1002740572312";

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();
            String firstName = update.getMessage().getFrom().getFirstName();

            if (update.hasMessage()) {
                long messageId = update.getMessage().getMessageId();

                try {
                    InetAddress address = InetAddress.getByName("api.telegram.org");
                    System.out.println("IP Address: " + address.getHostAddress());
                } catch (Exception e) {
                    System.err.println("Cannot resolve api.telegram.org: " + e.getMessage());
                }

                System.setProperty("http.proxyHost", "your.proxy.host");
                System.setProperty("http.proxyPort", "8080");
                System.setProperty("https.proxyHost", "your.proxy.host");
                System.setProperty("https.proxyPort", "8080");

                try {
                    if (messageText.toLowerCase().contains("confirm")) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText(firstName + " is working on this when you finish please reply DONE");
                        execute(message);
                    } else if (messageText.toLowerCase().contains("done")) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText(firstName + " has done above task successfully");
                        execute(message);
                    } else if (update.getMessage().getText().equals("/AllDriversInfo@waygodriversbot")) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText("Drivers INFO - FOR UPDATED VERSION" +
                                "\uD83D\uDE9B Unit 995 - Team - Waygo Logistics\n" +
                                "\n" +
                                "Truck VIN: 3AKJHHFG5JSJX0478\n" +
                                "California allowed: ✅\n" +
                                "\n" +
                                "Driver: Hikmat Ruziyev\n" +
                                "Phone: 267-699-9434\n" +
                                "Email: khikmatr@yahoo.com\n" +
                                "\n" +
                                "\uD83D\uDE9B Unit 998 - Team - WinRoad\n" +
                                "\n" +
                                "Truck VIN: 3AKJHHDR0KSKG1157\n" +
                                "California allowed: ❗\uFE0FNO DEF\n" +
                                "\n" +
                                "Driver: Kamronbek Abdullaev\n" +
                                "Phone: 929-660-4495\n" +
                                "Email: abdullaev057@gmail.com\n" +
                                "\n" +
                                "CoDriver: Ulugbek Djalilov\n" +
                                "Phone: 5139911001\n" +
                                "Email: ulugbek.usa2023@gmail.com\n" +
                                "\n" +
                                "\uD83D\uDE9B Unit 999 - Team - WinRoad\n" +
                                "\n" +
                                "Truck VIN: 3AKJHHDR2LSLV3635\n" +
                                "California allowed: ✅\n" +
                                "\n" +
                                "Driver: Brabham Gerald Jermaine\n" +
                                "Phone: \n" +
                                "Email: \n" +
                                "\n" +
                                "CoDriver: Dixon Shawn\n" +
                                "Phone: \n" +
                                "Email:\n" +
                                "\n" +
                                "Саидов Акбар, [07.07.2025 15:09]\n" +
                                "\uD83D\uDE9B Unit 253555 - Solo - WayGo\n" +
                                "\n" +
                                "Truck VIN: 4V4NC9EH4PN329009\n" +
                                "California allowed: ✅\n" +
                                "\n" +
                                "Driver: Singletary Darryl Leon JR\n" +
                                "Phone: (315) 317-5166\n" +
                                "Email:  singletarydj320@gmail.com\n" +
                                "\n" +
                                "\uD83D\uDE9B Unit 556550 - Solo - WayGo\n" +
                                "\n" +
                                "Truck VIN: 3AKJHHDR7NSNP1654\n" +
                                "California allowed: ✅\n" +
                                "\n" +
                                "Driver:  Saint CYR Romany\n" +
                                "Phone: 908-404-1448\n" +
                                "Email:  romanysaintcyr3@gmail.com\n" +
                                "\n" +
                                "\uD83D\uDE9B Unit 456359 - Team - Waygo Logistics\n" +
                                "\n" +
                                "Truck VIN: 4V4NC9EH9PN319849\n" +
                                "California allowed: ✅\n" +
                                "\n" +
                                "Driver: Shamar Keishan\n" +
                                "Phone: 32 12 79 88 22\n" +
                                "Email: byfieldshamar@yahoo.com\n" +
                                "\n" +
                                "CoDriver: Shazah Jamaal\n" +
                                "Phone: (305) 519-2334\n" +
                                "Email: cdishazah@gmail.com\n" +
                                "\n" +
                                "Саидов Акбар, [07.07.2025 15:23]\n" +
                                "Unit 997 - Team - ZIM\n" +
                                "\n" +
                                "Truck VIN: 3AKJHHDR8KSKB5494\n" +
                                "California allowed: ❗\uFE0FNO DEF\n" +
                                "\n" +
                                "Driver: Jorile Metelus \n" +
                                "Phone: (954) 497-0433\n" +
                                "Email: metelusjoriles07@gmail.com\n" +
                                "\n" +
                                "CoDriver: Willium Ilophene\n" +
                                "Phone: (215) 713-8706\n" +
                                "Email: williumilophene7@gmail.com\n" +
                                "\n" +
                                "\uD83D\uDE9B Unit 585360  - Solo - WinRoad\n" +
                                "\n" +
                                "Truck VIN: 4V4NC9EH0PN330075\n" +
                                "California allowed: ✅\n" +
                                "\n" +
                                "Driver: Chi Ming Chen\n" +
                                "Phone: (407) 530-8344\n" +
                                "Email: chuanchenll@gmail.com\n" +
                                "\n" +
                                "\uD83D\uDE9B Unit 251165 - Solo - WinRoad\n" +
                                "\n" +
                                "Truck VIN: 3AKJHHDR1RSUN1872\n" +
                                "California allowed: ✅\n" +
                                "\n" +
                                "Driver: Lahens Evens\n" +
                                "Phone: 9547705900\n" +
                                "Email: ticouma@yahoo.com\n" +
                                "\n" +
                                "\uD83D\uDE9B Unit 994 - Solo - ZIM\n" +
                                "\n" +
                                "Truck VIN: 3AKJGLD55GSGU7333\n" +
                                "California allowed: ❗\uFE0FNO DEF\n" +
                                "\n" +
                                "Driver: Pierre Enosch\n" +
                                "Phone: \n" +
                                "Email:");
                        execute(message);
                    } else if (update.getMessage().getText().equals("/CaStateAllowedUnits@waygodriversbot")) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText("CA STATE ALLOWED UNITS ONLY\n" +
                                "1) Unit 516438 (Romany)\n" +
                                "2) Unit 585360 (Dixon)\n" +
                                "3) Unit 465359 (Shazah)\n" +
                                "4) Unit 995 (Aka Hikmat)");
                        execute(message);
                    } else if (update.getMessage().getText().equals("/TruckExpensesCalculator@waygodriversbot")) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText("Truck expenses for 1 mile - NEXT VERSION");
                        execute(message);
                    }
                    else if (update.getMessage().getText().equals("/EldRules@waygodriversbot")) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText("RULES ABOUT ELD");
                        execute(message);
//                        DRIVERS INFO ------- DRIVERS INFO
//                        DRIVERS INFO ------- DRIVERS INFO
//                        DRIVERS INFO ------- DRIVERS INFO
                    } else if (update.getMessage().getText().toLowerCase().contains("kamron")) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText("\uD83D\uDE9B Unit 998 - Team - WinRoad\n" +
                                "\n" +
                                "Truck VIN: 3AKJHHDR0KSKG1157\n" +
                                "California allowed: ❗\uFE0FNO DEF\n" +
                                "\n" +
                                "Driver: Kamronbek Abdullaev\n" +
                                "Phone: 929-660-4495\n" +
                                "Email: abdullaev057@gmail.com\n" +
                                "\n" +
                                "CoDriver: Ulugbek Djalilov\n" +
                                "Phone: 5139911001\n" +
                                "Email: ulugbek.usa2023@gmail.com");
                        execute(message);
                    } else if (update.getMessage().getText().toLowerCase().contains("ulugbek") || update.getMessage().getText().toLowerCase().contains("ulug") || update.getMessage().getText().toLowerCase().contains("ulug'bek") || update.getMessage().getText().toLowerCase().contains("ulug'")) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText("\uD83D\uDE9B Unit 998 - Team - WinRoad\n" +
                                "\n" +
                                "Truck VIN: 3AKJHHDR0KSKG1157\n" +
                                "California allowed: ❗\uFE0FNO DEF\n" +
                                "\n" +
                                "Driver: Kamronbek Abdullaev\n" +
                                "Phone: 929-660-4495\n" +
                                "Email: abdullaev057@gmail.com\n" +
                                "\n" +
                                "CoDriver: Ulugbek Djalilov\n" +
                                "Phone: 5139911001\n" +
                                "Email: ulugbek.usa2023@gmail.com");
                        execute(message);
                    } else if (update.getMessage().getText().toLowerCase().contains("xikmat") || update.getMessage().getText().toLowerCase().contains("hikmat")) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText("\uD83D\uDE9B Unit 995 - Team - Waygo Logistics\n" +
                                "\n" +
                                "Truck VIN: 3AKJHHFG5JSJX0478\n" +
                                "California allowed: ✅\n" +
                                "\n" +
                                "Driver: Hikmat Ruziyev\n" +
                                "Phone: 267-699-9434\n" +
                                "Email: khikmatr@yahoo.com");
                        execute(message);
                    } else if (update.getMessage().getText().toLowerCase().contains("xikmat") || update.getMessage().getText().toLowerCase().contains("hikmat")) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText("");
                        execute(message);
                    } else if (update.getMessage().getText().toLowerCase().contains("xikmat") || update.getMessage().getText().toLowerCase().contains("hikmat")) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText("");
                        execute(message);
                    } else if (update.getMessage().getText().toLowerCase().contains("xikmat") || update.getMessage().getText().toLowerCase().contains("hikmat")) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText("");
                        execute(message);
                    } else if (update.getMessage().getText().toLowerCase().contains("xikmat") || update.getMessage().getText().toLowerCase().contains("hikmat")) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText("");
                        execute(message);
                    } else if (update.getMessage().getText().toLowerCase().contains("xikmat") || update.getMessage().getText().toLowerCase().contains("hikmat")) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText("");
                        execute(message);
                    }
                    else if (messageText.equalsIgnoreCase("ZIM sticker")) {
                        SendPhoto photoMessage = new SendPhoto();
                        photoMessage.setChatId(chatId);
                        File photoFile = new File("src/main/resources/img/zimsticker.jpg");
                        photoMessage.setPhoto(new InputFile(photoFile));
                        execute(photoMessage);
                    } else if (messageText.equalsIgnoreCase("waygo sticker")) {
                        SendPhoto photoMessage = new SendPhoto();
                        photoMessage.setChatId(chatId);
                        File photoFile = new File("src/main/resources/img/waygosticker.jpg");
                        photoMessage.setPhoto(new InputFile(photoFile));
                        execute(photoMessage);
                    } else if (messageText.equalsIgnoreCase("winroad sticker")) {
                        SendPhoto photoMessage = new SendPhoto();
                        photoMessage.setChatId(chatId);
                        File photoFile = new File("src/main/resources/img/winroadsticker.jpg");
                        photoMessage.setPhoto(new InputFile(photoFile));
                        execute(photoMessage);

                    } else if (messageText.toLowerCase().contains("ca state allowed") || messageText.toLowerCase().contains("ca ruxsat berilgan") || messageText.toLowerCase().contains("california state allowed") || messageText.toLowerCase().contains("california ruxsat berilgan")) {
                        SendMessage message = new SendMessage();
                        message.setChatId(chatId);
                        message.setText("CA STATE ALLOWED UNITS CA ga ruxsat beriladigan trucklar ro'yxati under WAYGO\n" +
                                "1) Unit 516438 (Romany)\n" +
                                "2) Unit 585360 (Dixon)\n" +
                                "3) Unit 465359 (Shazah)\n" +
                                "4) Unit 995 (Aka Hikmat)");
                        execute(message);
                    }



                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }

    private static SendMessage getSendMessage(long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("✅ZIM Logistics LLC\n" +
                "MC# 1561280\n" +
                "DOT # 4095685\n" +
                "SCAC# ABKBU\n" +
                "Ph number# +1(440) 445-88-22\n" +
                "Address- ENERGY DRIVE 2ND\n" +
                "FLOOR OFFICE 268 LOUISVILLE, OH \n" +
                "44641\n\n" + "✅ WayGoLogisticsLLC\n" +
                "MC# - 1236387\n" +
                "DOT# - 3620302\n" +
                "SCAC#- ATBNG\n" +
                "Ph.N#- (234) 529-29-23\n" +
                "Adress: 26250-26300 Euclid Avenue Suite 002\n" +
                "Euclid, OH 44132 \n\n" + "✅ WinRoadLogisticsLLC\n" +
                "MC# - 1460214\n" +
                "DOT# - 3935905\n" +
                "SCAC# - AWVOI\n" +
                "Ph.N# - (513) 828-62-66\n" +
                "Address: 8200 BECKETT PARK DR SUITE 111, WEST CHESTER, OH 45069");
        return message;
    }

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    public void startScheduler() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                SendMessage message = new SendMessage();
                message.setChatId(chatId);
                message.setText("⏰ Scheduled message every 1 hour!\n" +
                        "TO DO LIST FOR UPDATER:\n" +
                        "✅ 1: CHECK THE ELD OF DRIVERS : CHECK THE VIOLATIONS , DRIVING TIME SHOULD NOT BE LESS THAN 2 HOURS, CYCLE SHOULD NOT BE LESS THAN 20 HOURS, ALL TRAILER ID and DOCUMENTS SHOULD BE ENTERED PROPERLY, NEW SHIFT ALWAYS BEFORE VISITING THE RED ZONES ( CA, FL , WA, CT, OR, NM)\n" +
                        "✅ 2: MAKE SURE EVERYONE IS ON TIME , EVERYONE IS ON TIME TO BOTH DESTINATION AND PU and MAKE SURE ALL DELAYS REPORTED PROPERLY\n" +
                        "✅ 3: MAKE CALL IF DRIVER IS ON THE WAY , and MAKE SURE HE IS NOT SLEEPING \n" +
                        "✅ 4: MAKE A NOTE OF EVERYTHING , EVERY UPDATE DON'T KEEP IT ON THE MIND UNTILL THE END OF THE SHIFT !!!!!\n" +
                        "✅ 5: CHECK AND CHANGE THE DRIVERS STATUS ON TMS ON TIME , DRIVER IS AT HOME , SHIPPER , TRANSIT , SHOP and SO ON\n" +
                        "✅ 6: REPORT A DELAY ON TIME , DON'T KEEP IT UNTILL THE LAST HOUR OF DELIVERY\n" +
                        "✅ 7: CHECK THE DRIVERS CURRENT LOCATION MAKE SURE HE IS GOING TO RIGHT LOCATION AND PARKED AT SAFE PLACE\n" +
                        "Please reply to me if ** CONFIRM ** if you are working on this?");
                try {
                    execute(message);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 0, 3600000); // 60 minutes
    }


}
