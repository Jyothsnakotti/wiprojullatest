import { Injectable } from '@angular/core';
import { Movie } from '../models/movie.interface';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  private movies: Movie[] = [
    { movieId: 1, movieName: 'Inception', language: 'English', imdbRating: 8.8 },
    { movieId: 2, movieName: 'Parasite', language: 'Korean', imdbRating: 8.6 },
  ];

  getAll(): Movie[] {
    return [...this.movies];
  }

  getById(id: number): Movie | undefined {
    return this.movies.find(m => m.movieId === id);
  }

  add(movie: Movie): void {
    this.movies.push(movie);
  }

  update(movie: Movie): void {
    const index = this.movies.findIndex(m => m.movieId === movie.movieId);
    if (index !== -1) {
      this.movies[index] = movie;
    }
  }

  delete(id: number): void {
    this.movies = this.movies.filter(m => m.movieId !== id);
  }
}
