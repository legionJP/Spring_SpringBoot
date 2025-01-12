package com.jspring6.SpringMVCwebApp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
// Stereotype annotation , this gets transformed into the servlet by tomcat
public class HomeController {

    // @RequestMapping("/home") //give the path for root /
    @GetMapping("/home")
    public String home(){
        System.out.println(" Home Method Called ");
        return "index";
    }

// Another Controller
//    @RequestMapping("/add")
//    public String add()
//    {
//        System.out.println(" Add Method Called ");
//        return "result";
//        // Dispatch a servlet map the methods and views
//    }

// Accepting the data Servlet and Using the Http session
//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1")); // bcz http servlet req. return the string
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//        System.out.println(result);
//
//        // session
//        session.setAttribute("result", result); // name result.jsp and data result value , added in sessin object
//        return "result";
//        // Dispatch servlet map the methods and views like return the result.jsp

// Using the Spring way of Request Param with Https Session:
//
//    @RequestMapping("/add")
//    //public String add(int num1, int num2, HttpSession session) {
//
//    // requesting the actual var in the num and num2 using the RequestParam
//    public String add(@RequestParam("num1") int num, @RequestParam("num2") int num2, HttpSession session) {
////        int result = num1 + num2 +2;
//          int result = num + num2;
//        // session
//        session.setAttribute("result", result);
//        return "result";
//


// Using the Model as Interface to transfer the data b/w the view and controller (use the JSTL for the view)

//    @RequestMapping("/add")
//    //public String add(int num1, int num2, HttpSession session) {
//    public String add(@RequestParam("num1") int num, @RequestParam("num2") int num2,  Model model) {
//        int result = num + num2;
//        // adding the data obj in model
//        model.addAttribute("result", result);
//        return "result";

// Model and View Object , and return only one thing

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num, @RequestParam("num2") int num2, ModelAndView mv)
    {
        int result = num + num2;
        // adding the data obj in model
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;

    }

//1. Method for the addMe using the Model Attribute
//    @RequestMapping("addMe")
//    public ModelAndView addMe(@RequestParam("myID") int myID,  @RequestParam("myName") String myName, ModelAndView mv)
//    {
//        MyInfo myInfo = new MyInfo();
//        myInfo.setMyID(myID);
//        myInfo.setMyName(myName);
//
//        mv.addObject("myInfo", myInfo);
//        mv.setViewName("myInfo");
//        return mv;

// 2. Model attribute for the different name of obj MyInfo
//        @RequestMapping("addMe")
//        public String addMe(@ModelAttribute MyInfo myInfo)  // @ModelAttribute is responsible for assigning the value to objs
//        public String addMe(@ModelAttribute("myInfo1") MyInfo myInfo)
//        {
//            // No need to Implement these
////            MyInfo myInfo = new MyInfo();
////            myInfo.setMyID(myID);
////            myInfo.setMyName(myName);
////
////            mv.addObject("myInfo", myInfo);
////            mv.setViewName("myInfo");
//                return "myInfo";

// 2. Model attribute for the same name of obj MyInfo , and the @ModelAttribute is optional

//2.1 Model Attribute :
        @ModelAttribute("course")
        public String coursename()
        {
            return "Java";
        }

        @RequestMapping("addMe")
        public String addMe(MyInfo myInfo)  // here it will work without the model attribute behind the scene
        {
            return "myInfo";
        }

}
