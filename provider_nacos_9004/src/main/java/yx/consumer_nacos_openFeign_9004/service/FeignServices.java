package yx.consumer_nacos_openFeign_9004.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import yx.consumer_nacos_openFeign_9004.entity.GeoCode;

@FeignClient(value = "provider-service-nacos", path = "/geocode") // 服务提供方在nacos中的服务名
public interface FeignServices {

    @GetMapping("/geocode")
    Object listAll();

    @PostMapping("/geocode")
    Object add(@RequestBody GeoCode geoCode);

    @PutMapping("/geocode")
    Object update(@RequestBody GeoCode geoCode);

    @DeleteMapping("/geocode/{id}")
    Object delete(@PathVariable("id") Integer id);

    @GetMapping("/geocode/{id}")
    Object getById(@PathVariable("id") Integer id);
}