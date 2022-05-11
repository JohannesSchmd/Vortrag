package fh.aalen.video;

import org.springframework.data.repository.CrudRepository;

public interface VideoRepository extends CrudRepository<Video, String> {

	public List<Video> findByGenreOrderByTitle(String genre);
	
}
