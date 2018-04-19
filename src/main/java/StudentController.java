import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/students")
public class StudentController {

	@RequestMapping(method = RequestMethod.GET)
	public Student[] getAll() {
		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public ResponseEntity get(@PathVariable long id) {

		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/lastname/{name}")
	public ResponseEntity getByLastName(@PathVariable String name) {
		return null;

	}

	@RequestMapping(method = RequestMethod.GET, value = "/title/{name}")
	public ResponseEntity getByTitle(@PathVariable String name) {
		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/department/{name}")
	public ResponseEntity getByDept(@PathVariable String name) {
		return null;

	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity add(@RequestBody Student employee) {
		return null;

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public ResponseEntity delete(@PathVariable long id) {
		return null;

	}
}
