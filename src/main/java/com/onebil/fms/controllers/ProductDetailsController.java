package com.onebil.fms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onebil.fms.dto.ResponseDTO;
import com.onebil.fms.entities.AddOnCharge;
import com.onebil.fms.entities.ProductPlanDetails;
import com.onebil.fms.service.AddOnChargeService;
import com.onebil.fms.service.ProductPlanDetailsService;

@RestController
@RequestMapping("/productinfo")
@CrossOrigin("*")
public class ProductDetailsController {
	@Autowired
	
	public ProductPlanDetailsService detailservice;
	public AddOnChargeService addonservice;
	
	@PostMapping(value="/productdetail")
	public ResponseDTO addPlanDetails(@RequestBody ProductPlanDetails plandetails) {
		ResponseDTO response = new ResponseDTO();
		response.setResponse(detailservice.addPlanDetails(plandetails));
		return response;
	}
	@GetMapping(value = "/productdetail/{planDetailId}")
	public ResponseDTO getPlanDetails(@PathVariable int planDetailId) {
		ResponseDTO response = new ResponseDTO();
		response.setResponse(detailservice.getPlanDetails(planDetailId));
		return response;

	}

	@PutMapping(value="/productdetail")
	public ResponseDTO UpdatePlanDetails(@RequestBody ProductPlanDetails plandetails) {
		ResponseDTO response = new ResponseDTO();
		response.setResponse(detailservice.UpdatePlanDetails(plandetails));
		return response;
	}

	@DeleteMapping(value = "/productdetail/{planDetailId}")
	public ResponseDTO deletePlanDetails(@PathVariable int planDetailId) {
		ResponseDTO response = new ResponseDTO();
		response.setResponse(detailservice.deletePlanDetails(planDetailId));
		return response;
	}

	@PostMapping(value = "/productdetails")
	public ResponseDTO getAllplanDeatails() {
		ResponseDTO response = new ResponseDTO();
		response.setResponse(detailservice.getAllplanDeatails());
		return response;
	}

	
	@PostMapping(value="/productaddon")
	public ResponseDTO addAddonCharges(@RequestBody AddOnCharge addon) {
		ResponseDTO response = new ResponseDTO();
		response.setResponse(addonservice.addAddonCharges(addon));
		return response;
	}
	@GetMapping(value = "/productaddon/{addonChargeId}")
	public ResponseDTO getAddonCharges(@PathVariable int addonChargeId) {
		ResponseDTO response = new ResponseDTO();
		response.setResponse(addonservice.getAddonCharges(addonChargeId));
		return response;

	}

	@PutMapping(value="/productaddon")
	public ResponseDTO updateAddonCharges(@RequestBody AddOnCharge addon) {
		ResponseDTO response = new ResponseDTO();
		response.setResponse(addonservice.updateAddonCharges(addon));
		return response;
	}


	@GetMapping(value = "/productaddons")
	public ResponseDTO getAllAddonCharges() {
		ResponseDTO response = new ResponseDTO();
		response.setResponse(addonservice.getAllAddonCharges());
		return response;
	}

	

	

}
