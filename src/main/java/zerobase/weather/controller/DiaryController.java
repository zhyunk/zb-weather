package zerobase.weather.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import zerobase.weather.service.DiaryService;

import java.time.LocalDate;

@Controller
public class DiaryController {
    private final DiaryService diaryService;

    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    @PostMapping("/create/diary")
    void createDiary(
            @RequestParam
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) // date 포맷 형식 지정해서 받음 ISO.DATE = yyyy-MM-dd = "2000-10-31"
            LocalDate date,

            @RequestBody
            String text
    ) {
        diaryService.createDiary(date, text);
    }

}
