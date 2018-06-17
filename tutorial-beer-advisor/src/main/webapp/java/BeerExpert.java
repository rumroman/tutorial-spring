import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }else{
            brands.add("Jale Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }

    public static class BeerSelect extends HttpServlet {

        @Override
        public void doPost(HttpServletRequest request,
                           HttpServletResponse response)
                            throws IOException, ServletException {

            String c = request.getParameter("color");
            BeerExpert beerExpert = new BeerExpert();
            List<String> result = beerExpert.getBrands(c);
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("Beer Selection Advice<br>");



            result.forEach(item -> out.print("<br>try: " + item));

        }

    }
}
