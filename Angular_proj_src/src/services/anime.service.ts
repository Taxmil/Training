import { Injectable } from '@angular/core';
import { Anime } from '../model/anime';

@Injectable({
  providedIn: 'root'
})
export class AnimeService {
  private animeList: Anime[] = [
    { id: 1, title: 'Attack on Titan', genre: 'Action', rating: 9, description: 'Humanity fights titans', image: 'assets/image/aot.jpg' },
    { id: 2, title: 'One peice', genre: 'Adventure', rating: 8, description: 'Sea Adventure', image: 'assets/image/onepeice.jpg' },
    { id: 3, title: 'Death Note', genre: 'Thriller', rating: 10, description: 'A notebook that kills', image: 'assets/image/deathnote.jpg' }
  ];

  getAnimeList(): Anime[] {
    return this.animeList;
  }
}
