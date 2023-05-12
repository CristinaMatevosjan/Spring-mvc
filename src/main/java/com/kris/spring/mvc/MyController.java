//package com.kris.spring.mvc;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//
//@Controller
//@RequestMapping("/employee0")
//public class MyController {
//    @RequestMapping("/0")
//    public String firstView(){
//        return "first-view";
//    }
//    @RequestMapping("/askDetails0") // аннотация для связи с юрл
//    public String askEmployeeDetails(){
//        return "ask-emp-details-view";  // возвращает имя вью, далее благодаря конфиг файлу
//        // к нему добавляются префиксы и суффиксы для локализации
//    }
////    @RequestMapping("showDetails")
////    public String showEmpDetails(){
////        return "show-emp-details-view";
////    }
////        @RequestMapping("showDetails")
////        public String showEmpDetails(HttpServletRequest request, Model model){
////        String empName= request.getParameter("employeeName"); // содержит инфо о запросе и можно его получить
////        //используем значение помеченное переменной эмплои нейм во вью лежит
////        empName="Ms. "+ empName; // меняю это значение
////        model.addAttribute("nameAtribute",empName); // записываю эту инфу в модель
////            model.addAttribute("description","muter");
////
////        return "show-emp-details-view";
////        }
//    @RequestMapping("/showDetails0")
//    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model){ //более
//        // простой метод без запроса сервлета, а через аннотацию сразу передаем параметр
//
//        empName="Ms. "+ empName; // меняю это значение
//        model.addAttribute("nameAtribute",empName); // записываю эту инфу в модель
//
//        return "show-emp-details-view";
//    }
//         }
