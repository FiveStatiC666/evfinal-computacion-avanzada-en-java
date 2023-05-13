
package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/datos")
public class crearCuentaC 
{
    @RequestMapping(value="datos.htm", method=RequestMethod.GET)
    public ModelAndView mosrarDatos()
    {
        ModelAndView mav=new ModelAndView("datos");
        return mav;
    }
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView datos(@RequestParam("fecha") String fecha, @RequestParam("edad") int edad, @RequestParam("peso") double peso, @RequestParam("altura") double altura,@RequestParam("usuario") String usuario, @RequestParam("password") String password, @RequestParam("imc") double imc, Model modelo)
    {
        ModelAndView mav=new ModelAndView("datos");
        String query= "SELECT * FROM Persona WHERE usuario="+usuario+";";
        if (edad > 15)
        {            
            if(altura < 2.5 || altura < 1)
            {
                query="INSERT INTO Persona VALUES (?,?,?,?,?)";
                imc=peso/(altura*altura);
                query="INSERT INTO Tabla VALUES (?,?,?,?,?,?)";
            }
            else
            {
                modelo.addAttribute("error", "la altura es mayor a 2.5 o menor a 1");
            }
        }
        else
        {
            modelo.addAttribute("error", "la edad es menor a 15");
        }
        
        return mav;
    }
}
