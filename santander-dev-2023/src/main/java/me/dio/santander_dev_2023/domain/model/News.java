package me.dio.santander_dev_2023.domain.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;

@Entity(name = "tb_news")
@Schema(description = "Entidade que representa uma notícia")
public class News extends BaseItem{
}
