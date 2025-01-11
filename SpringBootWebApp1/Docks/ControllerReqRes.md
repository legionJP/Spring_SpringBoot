- Spring allows to have the multiple controller in the one particular controller


# Controller
//    @RequestMapping("/add")
//    public String add()
//    {
//        System.out.println(" Add Method Called ");
//        return "result";
//        // Dispatch a servlet map the methods and views
//    }

# // Accepting the data Servlet
@RequestMapping("/add")
public String add(HttpServletRequest req) {
int num1 = Integer.parseInt(req.getParameter("num1")); // bcz http req return the string
int num2 = Integer.parseInt(req.getParameter("num2"));
int result = num1 + num2;
System.out.println(result);
return "result";
