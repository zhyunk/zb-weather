package zerobase.weather.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DiaryService {
    @Value("${open-weather}")
    private String apiKey;

    public void createDiary(LocalDate date, String text) {
        getWeatherString();
    }

    private String getWeatherString() {
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=seoul&appId=" + apiKey;
        System.out.println(apiUrl);
        return "";
    }
}
