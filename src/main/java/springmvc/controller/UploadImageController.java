package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadImageController {

	@RequestMapping(path="/uploadform")
	public String showUploadForm(Model model) {
		model.addAttribute("data", null);
		return "uploadImage";
	}
	
	@RequestMapping(path="/processimage", method=RequestMethod.POST)
	public String processUploadForm(@RequestParam("fname") MultipartFile file) {
		System.out.println("hello");
		System.out.println(file);
		return "successUpload";
	}
}
