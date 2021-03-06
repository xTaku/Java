package daos.v1;

import entities.ToDo;
import entities.ToDoDto;
import java.util.List;
import java.util.Optional;

public interface ToDoDao {
    ToDo create(ToDoDto dto);
    Optional<ToDo> read(String id);
    List<ToDo> readAll();
    Optional<ToDo> update(ToDo toDo);
    Boolean delete(String id);
}
