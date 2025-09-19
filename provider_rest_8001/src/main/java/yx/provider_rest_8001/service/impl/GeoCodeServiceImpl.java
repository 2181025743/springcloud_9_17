package yx.provider_rest_8001.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import yx.provider_rest_8001.entity.GeoCode;
import yx.provider_rest_8001.mapper.GeoCodeMapper;
import yx.provider_rest_8001.service.GeoCodeService;

@Service
public class GeoCodeServiceImpl extends ServiceImpl<GeoCodeMapper, GeoCode> implements GeoCodeService {
}
