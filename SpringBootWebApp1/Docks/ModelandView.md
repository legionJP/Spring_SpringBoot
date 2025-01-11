@RequestMapping("/add")
public ModelAndView add(@RequestParam("num1") int num, @RequestParam("num2") int num2, ModelAndView mv) {
int result = num + num2;
// adding the data obj in model
mv.addObject("result", result);
mv.setViewName("result");
return mv;