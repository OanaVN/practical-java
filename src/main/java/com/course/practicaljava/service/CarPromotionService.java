package com.course.practicaljava.service;

import java.util.List;

public interface CarPromotionService {

	List<String> pROMOTION_TYPES = List.of("bonus", "discount");

	boolean isValidPromotionType(String promotionType);
}
