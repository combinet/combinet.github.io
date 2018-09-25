package tutorial.web;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import model.Article;
import model.Student;

@Controller
public class TutorialController {
	@RequestMapping("tut/getMethodTest.do")
	public String getMethodTest(@RequestParam String p1, @RequestParam String p2, ModelMap model) {
		String msg = String.format("tut/getMethodTest.do 결과 : \n p1: %s, p2: %s", p1, p2);
		System.out.format(msg);

		model.addAttribute("getMethodTestMsg", msg);
		return "tut/result";
	}

    @SuppressWarnings("rawtypes")
	@RequestMapping("/tut/postMethodTest.do")
    public void postMethodTest(@RequestParam Map data, ModelMap model) {
    	model.addAttribute("result", data);

    	// return type이 void 이면 default postMethodTest.jsp로 forward
    }

	@RequestMapping("/tut/postMethodModel.do")
    public void postMethodModel(@ModelAttribute Article data, ModelMap jspData) {
    	jspData.addAttribute("articleData", data);
    }

	////////////////////  ajax

	@SuppressWarnings("rawtypes")
	@RequestMapping("tut/getAjax.do")
	@ResponseBody
	public Map getAjax(@RequestParam String p1, @RequestParam String p2) {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("p1", p1);
		data.put("p2", p2);
		data.put("success", "success");
		data.put("no", 10);
		data.put("booleanData", true);

		return data;
	}

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ResponseBody
	@RequestMapping("/tut/postAjax.do")
    public Map postAjax(@RequestParam Map data, ModelMap model) {
    	data.put("server success", "success");

    	return data;
    }


    @SuppressWarnings({ "unchecked", "rawtypes" })
	@ResponseBody
	@RequestMapping("/tut/postFileAjax.do")
    public Map postFileAjax(MultipartHttpServletRequest multiRequest,  @RequestParam Map data) {
    	String fileName = getFileNames(multiRequest);

    	data.put("server success", "success");
    	data.put("uploadFileName", fileName);

    	return data;
    }
    
    

    @SuppressWarnings({ "unchecked", "rawtypes" })
	private String getFileNames(MultipartHttpServletRequest multiRequest) {
    	StringBuffer sb = new StringBuffer();

    	Map<String, MultipartFile> files = multiRequest.getFileMap();
    	for (Iterator iterator = files.entrySet().iterator(); iterator.hasNext();) {
			Entry<String, MultipartFile> entry = (Entry<String, MultipartFile>) iterator.next();
			MultipartFile file = entry.getValue();
			sb.append(file.getOriginalFilename());
		}
		return sb.toString();
	}

	////////////////// json

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("tut/postJson.do")
	@ResponseBody
	public Map postJson(@RequestBody Map param) {
		String msg = String.format("tut/getMethodTest.do 결과 : \n p1: %s, p2: %s", param.get("p1"), param.get("p2"));
		System.out.format(msg);

		List stringList = new ArrayList();
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");

		param.put("int", 10);
		param.put("boolean data", true);
		param.put("date", new Date());
		param.put("string List", stringList);
		param.put("message", msg);

		return param;
	}


	@RequestMapping("tut/postJsonVO.do")
	@ResponseBody
	public Student postJsonVO(@RequestBody Student param) {
		LocalDate birth = LocalDate.of(2002, 8, 10);
		Date birthday = Date.from(birth.atStartOfDay(ZoneId.systemDefault()).toInstant());

		param.setBirthday( birthday );

		return  param;
	}


	// DAO insert


	// ETC
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}
