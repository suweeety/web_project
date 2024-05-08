package com.groovus.www.controller;

import com.groovus.www.dto.CalendarDTO;
import com.groovus.www.service.CalendarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/calendar")
@Log4j2
@RequiredArgsConstructor
public class CalendarController {

    private final CalendarService calendarService;

//    @PostMapping("/register")
//    public String registerPOST(@Valid CalendarDTO calendarDTO, BindingResult bindingResult, RedirectAttributes rttr) {
//
//        log.info("registerPOST 확인");
//
//        if(bindingResult.hasErrors()) {
//            log.info("has errors...");
//            rttr.addFlashAttribute("errors", bindingResult.getAllErrors());
//        }
//
//        // 카테고리를 한글화하는 작업
//        if(calendarDTO.getCal_cate().equals("bg-team")) {
//            calendarDTO.setCal_cate("팀 회의");
//        } else if(calendarDTO.getCal_cate().equals("bg-dept")) {
//            calendarDTO.setCal_cate("부서 회의");
//        } else if(calendarDTO.getCal_cate().equals("bg-company-event")) {
//            calendarDTO.setCal_cate("사내 행사");
//        } else if(calendarDTO.getCal_cate().equals("bg-personal-event")) {
//            calendarDTO.setCal_cate("개인 일정");
//        } else if(calendarDTO.getCal_cate().equals("bg-account-event")) {
//            calendarDTO.setCal_cate("거래처 일정");
//        } else if(calendarDTO.getCal_cate().equals("bg-business-trip")) {
//            calendarDTO.setCal_cate("출장");
//        } else {
//            calendarDTO.setCal_cate("기타");
//        }
//
//        log.info("calendarDTO: " + calendarDTO);
//
//        Long cal_id = calendarService.register(calendarDTO);
//
//        rttr.addFlashAttribute("result", cal_id);
//
//        return "redirect:/calendar/schedule";
//
//    }


}