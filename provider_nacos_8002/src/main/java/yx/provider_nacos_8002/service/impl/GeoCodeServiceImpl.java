package yx.provider_nacos_8002.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import yx.provider_nacos_8002.entity.GeoCode;
import yx.provider_nacos_8002.mapper.GeoCodeMapper;
import yx.provider_nacos_8002.service.GeoCodeService;

@Service
public class GeoCodeServiceImpl extends ServiceImpl<GeoCodeMapper, GeoCode> implements GeoCodeService {
}
