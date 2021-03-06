package simple.boot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.RestController;

import simple.boot.model.Address;
import simple.boot.repository.AddressRepository;

@RestController
@RequestMapping("/")
public class MySimpleController {

	@Autowired
	private AddressRepository addressRepository;

	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public Address getAddress(@PathVariable("name") String name) {
		Address addr = addressRepository.findByName(name);
		return addr;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public Address hi() {
		return new Address();
	}

	
}

