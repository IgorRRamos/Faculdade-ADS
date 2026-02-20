package com.igorramos.aulaArquitetura.repositorys;

import com.igorramos.aulaArquitetura.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorys extends JpaRepository <User, Long>{
}
