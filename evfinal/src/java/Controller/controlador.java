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
@RequestMapping("/index")
public class controlador
{

    private ModelAndView mav;
    @RequestMapping(value="index.htm", method=RequestMethod.GET)
    public ModelAndView mosrarIndex()
    {
        ModelAndView mav=new ModelAndView("index");
        return mav;
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView inicioSesion(@RequestParam("usuario") String usuario, @RequestParam("password") String contraseña, Model modelo)
    {
        try
        {
            String query="SELECT contraseña FROM Personaa WHERE usuario= "+usuario+";";
            if(contraseña==query)
            {
                String Datos="SELECT * FROM Persona WHERE usuario="+usuario+";";
            }
            else
            {
                modelo.addAttribute("error", "No ingresaste la contraseña correcta");
            }
        }
        catch(IndexOutOfBoundsException e)
        {
            modelo.addAttribute("error", "Hubo un problema con el inicio de la sesión");
        }
        
        return mav;
    }
}