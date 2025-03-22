package me.dio.santander_dev_2023.domain.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;

@Entity(name = "tb_feature")
@Schema(description = "Entidade que representa uma funcionalidade")
public class Feature extends BaseItem{
}
