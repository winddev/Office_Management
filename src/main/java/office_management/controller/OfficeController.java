package office_management.controller;


import office_management.model.Office;
import office_management.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OfficeController {
    private OfficeService officeService;

    @Autowired(required = true)
    @Qualifier(value = "officeService")
    public void setOfficeService(OfficeService officeService) {
        this.officeService = officeService;
    }

    @RequestMapping(value = "offices", method = RequestMethod.GET)
    public String listOffice(Model model){
        model.addAttribute("office", new Office());
        model.addAttribute("listOffice", this.officeService.listOffice());

        return "offices";
    }

    @RequestMapping(value = "/offices/add", method = RequestMethod.POST)
    public String addOffice(@ModelAttribute("office") Office office){
        if(office.getId() == 0){
            this.officeService.addOffice(office);
        }else {
            this.officeService.updateOffice(office);
        }

        return "redirect:/offices";
    }

    @RequestMapping("/remove/{id}")
    public String removeOffice(@PathVariable("id") int id) {
        this.officeService.removeOffice(id);

        return "redirect:/offices";
    }

    @RequestMapping("edit/{id}")
    public String editBook(@PathVariable("id") int id, Model model){
        model.addAttribute("office", this.officeService.getOfficeById(id));
        model.addAttribute("listOffice", this.officeService.listOffice());

        return "offices";
    }

    @RequestMapping("officedata/{id}")
    public String bookData(@PathVariable("id") int id, Model model){
        model.addAttribute("office", this.officeService.getOfficeById(id));

        return "officedata";
    }

}
