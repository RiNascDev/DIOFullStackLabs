package me.dio.gameawards.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import me.dio.gameawards.domain.model.Game;
import me.dio.gameawards.domain.model.GameRepository;
import me.dio.gameawards.service.GameService;

public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameRepository repository;

	@Override
	public List<Game> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game findByid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Long id, Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
