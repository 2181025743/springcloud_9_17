package yx.consumer_nacos_openFeign_9004.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import yx.consumer_nacos_openFeign_9004.entity.GeoCode;
import yx.consumer_nacos_openFeign_9004.service.FeignServices;

/**
 * @author Administrator
 * cloud_project
 */
@RestController
@RequestMapping("/webgis")
public class WebGisController {

    @Resource
    private FeignServices geoCodeService;

    @GetMapping
    public Object list() {
        return geoCodeService.listAll();
    }

    @PostMapping
    public Object save(@RequestBody GeoCode geoCode) {
        return geoCodeService.add(geoCode);
    }

    @DeleteMapping("{id}")
    public Object delete(@PathVariable Integer id) {
        return geoCodeService.delete(id);
    }

    @GetMapping("{id}")
    public Object getById(@PathVariable Integer id) {
        return geoCodeService.getById(id);
    }

    @PutMapping
    public Object update(@RequestBody GeoCode geoCode) {
        return geoCodeService.update(geoCode);
    }
}