package za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.domain.People.Owner;
import za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.factories.people.OwnerFactory;
import za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.service.OwnerServiceImpl;

import java.util.Map;

@RequestMapping("/spazaAutoSystem/owner")
public class OwnerController
{
    @Autowired
    private OwnerServiceImpl service;

    @GetMapping("/welcome.html")
    public @ResponseBody
    Owner create(@PathVariable Map<String, String> values, String ownerId)
    {
        Owner owner = OwnerFactory.getOwner(ownerId);
        return service.create(owner);
    }
}
