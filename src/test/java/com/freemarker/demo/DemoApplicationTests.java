package com.freemarker.demo;

import com.freemarker.demo.vo.NormVo;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.ModelMap;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() throws IOException, TemplateException {
		Map<String, List<Object>> instanceMap = new HashMap<>();
		List<Object> list = new ArrayList<>();
		NormVo normVo1 = new NormVo();
		normVo1.setNum(1);
		normVo1.setName("queue1");
		normVo1.setType("问题1");
		NormVo normVo2 = new NormVo();
		normVo2.setNum(2);
		normVo2.setName("queue2");
		normVo2.setType("问题2");
		list.add(normVo1);
		list.add(normVo2);
		instanceMap.put("instance1",list);
		ModelMap model = new ModelMap();
		model.addAttribute("date","2023年4月5日");
		model.addAttribute("instanceMap", instanceMap);

		Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
		cfg.setClassForTemplateLoading(getClass(), "/templates");
		Template template = cfg.getTemplate("example.ftl");
		StringWriter out = new StringWriter();
		template.process(model, out);
		String htmlContent = out.toString();
		System.out.println(htmlContent);
	}

	@Test
	public void testMap(){
		Map<Object, Object> map = new HashMap<>();
		Map<Object, Object> map1 = new HashMap<>();
		map1.put("canal159019705f-3c8d-466d-966a-9a54ce8dab83","H4sIAAAAAAAAAF2PwUoDMRCG74G8w4Av0EUFyU3tRaQgVLzPJuMazCbb7EToXRBP23PPBa+91uexFd/CxEUQb8PHN/P/Y5BxHlLUdE1LBYbuMTmezqUw1LP1yDZ4BXftsl+4ycnkWIomhtRdGQVNJYUOXqcYybMCjonyXj3DrrO+UVIAmHy/xp4UaPToqtMCM3KZcE6oAEYSG+Jp/U8r8HaUn0r+2R/55vEnAMDmKtaUucXu3LnfIgDE7jJ4Y8cfCtGhbS1fIOsHBRUcweF19/UyHIbVx/vmc/2837ztt4MU3zABGh0XAQAA");
		map1.put("canal159019705f-3c8d-466d-966a-9a54ce8dab99","H4sIAAAAAAAAAF2PwUoDMRCG74G8w4Av0EUFyU3tRaQgVLzPJuMazCbb7EToXRBP23PPBa+91uexFd/CxEUQb8PHN/P/Y5BxHlLUdE1LBYbuMTmezqUw1LP1yDZ4BXftsl+4ycnkWIomhtRdGQVNJYUOXqcYybMCjonyXj3DrrO+UVIAmHy/xp4UaPToqtMCM3KZcE6oAEYSG+Jp/U8r8HaUn0r+2R/55vEnAMDmKtaUucXu3LnfIgDE7jJ4Y8cfCtGhbS1fIOsHBRUcweF19/UyHIbVx/vmc/2837ztt4MU3zABGh0XAQAA");


		System.out.println('"'+map1.toString()+'"');
		map.put("canal_adapter_files",map1.toString());




	}

}
