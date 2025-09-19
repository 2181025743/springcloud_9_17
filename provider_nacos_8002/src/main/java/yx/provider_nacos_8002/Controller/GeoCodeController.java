package yx.provider_nacos_8002.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import yx.provider_nacos_8002.entity.GeoCode;
import yx.provider_nacos_8002.service.GeoCodeService;

@RestController
@RequestMapping("/geocode")
public class GeoCodeController {
    @Value("${server.port}")
    private String port;

    @Autowired
    private GeoCodeService geoCodeService;

    @GetMapping
    public Object listAll() {
        System.out.println(port);
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
        return geoCodeService.getById(id) + port;
    }
}