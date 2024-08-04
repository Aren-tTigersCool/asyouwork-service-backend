package com.example.atc.domain.favorite.repository;
import com.example.atc.domain.favorite.entity.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
}