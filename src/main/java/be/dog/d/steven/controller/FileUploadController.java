package be.dog.d.steven.controller;

import be.dog.d.steven.service.UploadService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

    @GetMapping("/upload")
    public String upload(){
        return "upload";
    }

    /**
     * Upload single file using Spring Controller
     */
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public @ResponseBody
    String uploadFileHandler(@RequestParam("name") String name,
                             @RequestParam("file") MultipartFile file) {

        return UploadService.handleUpload(name, file);
    }

}
