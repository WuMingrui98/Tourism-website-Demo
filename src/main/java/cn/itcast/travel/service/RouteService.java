package cn.itcast.travel.service;

import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;

public interface RouteService {
	PageBean<Route> pageQuery(int cid, String rname, int currentPage, int pageSize);
	Route findOne(int rid);
}
