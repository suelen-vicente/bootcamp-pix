package matera.bootcamp.pix.service.usuario;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import matera.bootcamp.pix.domain.model.ContaCorrente;
import matera.bootcamp.pix.domain.repository.ContaCorrenteRepository;

@Service
@RequiredArgsConstructor
public class ConsultaContaUsuarioService {
	
	private final ContaCorrenteRepository contaCorrenteRepository;

    public ContaCorrente consultarContaPorUsuarioId(Long id) {
    	return contaCorrenteRepository.findByUsuarioId(id)
    			.orElse(null);
    }

}
