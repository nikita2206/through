package com.through.data_source.controller

import com.through.data_source.controller.data.DataSourceApi
import com.through.data_source.entity.DataSource
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import javax.persistence.EntityManager
import javax.transaction.Transactional

@Controller
@RequestMapping("/data-source") // `POST /data-source` {"type": "mysql", "hostname": "127.0.0.1"}
class DataSourceController(
    private val em: EntityManager
) {

    @Transactional
    @PostMapping("")
    fun addDataSource(@RequestBody request: DataSourceApi): ResponseEntity<String> {
        val dataSource = DataSource(
            type = request.type.entityVariant,
            hostname = request.hostname,
            port = request.port,
            user = request.user,
            password = request.password
        )

        em.persist(dataSource)

        return ResponseEntity.ok("asd")
    }

}
