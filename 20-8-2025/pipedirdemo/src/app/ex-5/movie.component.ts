import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { MovieService } from './services/movie.service';
import { Movie } from './models/movie.interface';

@Component({
  selector: 'app-movie',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {
  movies: Movie[] = [];
  movieModel: Movie = { movieId: 0, movieName: '', language: '', imdbRating: 0 };
  isEditMode = false;

  constructor(private movieService: MovieService) {}

  ngOnInit(): void {
    this.loadMovies();
  }

  loadMovies(): void {
    this.movies = this.movieService.getAll();
  }

  addMovie(): void {
    if(this.isEditMode) {
      // update
      this.movieService.update(this.movieModel);
    } else {
      // set unique id
      this.movieModel.movieId = Date.now();
      this.movieService.add(this.movieModel);
    }
    this.resetForm();
    this.loadMovies();
  }

  editMovie(movie: Movie): void {
    this.movieModel = { ...movie };
    this.isEditMode = true;
  }

  deleteMovie(id: number): void {
    this.movieService.delete(id);
    this.loadMovies();
  }

  resetForm(): void {
    this.movieModel = { movieId: 0, movieName: '', language: '', imdbRating: 0 };
    this.isEditMode = false;
  }
}
