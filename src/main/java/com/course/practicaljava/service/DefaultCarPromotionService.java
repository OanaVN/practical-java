package com.course.practicaljava.service;

import org.springframework.stereotype.Service;

@Service
public class DefaultCarPromotionService implements CarPromotionService {

	@Override
	public boolean isValidPromotionType(String promotionType) {
		// TODO Auto-generated method stub
		return pROMOTION_TYPES.contains(promotionType.toLowerCase());
	}

}
