package qkg.demo

import org.eclipse.microprofile.config.inject.ConfigProperty
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/ping")
class PingResource {
    @ConfigProperty(name = "ping.message")
    lateinit var message : String

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun ping(): String? = message
}