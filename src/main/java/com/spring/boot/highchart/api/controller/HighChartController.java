package com.spring.boot.highchart.api.controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HighChartController {

	@RequestMapping("/graph1")
	public String generateGraph(Model model) {
		Map<String, Integer> techMap = getTechnologyMap();
		model.addAttribute("techMap", techMap);
		return "graph1";
	}

	@RequestMapping("/graph2")
	public String generateRotateGraph(Model model) {
		Map<String, Integer> techMap = getTechnologyMap();
		model.addAttribute("techMap", techMap);
		return "graph2";
	}

	@RequestMapping("/lineChart")
	public String lineXhartGraph(Model model) {
		Map<String, Integer> techMap = getTechnologyMap();
		model.addAttribute("techMap", techMap);
		return "lineChart";
	}

	@RequestMapping("/pie")
	public String generatePieChart(Model model) {
		model.addAttribute("java", 48);
		model.addAttribute("Net", 12);
		model.addAttribute("python", 9);
		model.addAttribute("Rpa", 21);
		model.addAttribute("MainFrame", 10);
		return "pie";
	}

	@RequestMapping("/activityChart")
	public String generateActivityChart(Model model) {
		model.addAttribute("java", 80);
		model.addAttribute("Net", 40);
		model.addAttribute("python", 60);
		model.addAttribute("Rpa", 90);
		model.addAttribute("MainFrame", 10);
		return "activity";
	}

	private Map<String, Integer> getTechnologyMap() {
		Map<String, Integer> techMap = new ConcurrentHashMap<>();
		techMap.put("Java", 89);
		techMap.put(".Net", 57);
		techMap.put("Php", 65);
		techMap.put("Python", 45);
		techMap.put("SAP", 78);
		techMap.put("Pega", 32);
		techMap.put("RPA", 92);
		techMap.put("Pega", 29);
		return techMap;
	}
}