## Display the data on Result Page

```
Accepting the data Servlet and Using the Http session
@RequestMapping("/add")
public String add(HttpServletRequest req, HttpSession session) {
int num1 = Integer.parseInt(req.getParameter("num1")); // bcz http req return the string
int num2 = Integer.parseInt(req.getParameter("num2"));
int result = num1 + num2;
System.out.println(result);

        // session
session.setAttribute("result", result); 
// name result.jsp and data result value , added in session object
        return "result";
// Dispatch servlet map the methods and views like return the result.jsp

```
