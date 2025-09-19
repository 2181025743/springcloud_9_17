package yx.provider_rest_8001.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yx.provider_rest_8001.entity.GeoCode;
import yx.provider_rest_8001.service.GeoCodeService;

@RestController
@RequestMapping("/geocode")
public class GeoCodeController {

    @Autowired
    private GeoCodeService geoCodeService;

    @GetMapping
    public Object listAll() {
        return geoCodeService.list();
    }

    @PostMapping
    public Object add(@RequestBody GeoCode geoCode) {
        return geoCodeService.save(geoCode);
    }

    @PutMapping
    public Object update(@RequestBody GeoCode geoCode) {
        return geoCodeService.updateById(geoCode);
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable Integer id) {
        return geoCodeService.removeById(id);
    }

    @GetMapping("/{id}")
    public Object getById(@PathVariable Integer id) {
        return geoCodeService.getById(id);
    }
}