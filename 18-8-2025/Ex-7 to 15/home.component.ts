import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

interface Book {
  title: string;
  about: string;
  imgUrl: string;
}

@Component({
  selector: 'home',
  standalone: true,
  imports: [CommonModule],
  template: `
    <div class="container mt-4">
      <div class="row">
        <div 
          class="col-md-2 mb-4 d-flex flex-column align-items-center"
          *ngFor="let book of books"
        >
          <img [src]="book.imgUrl"
               alt="Book cover"
               class="img-fluid mb-2"
               style="max-height:120px;width:auto;border:1px solid #aaa;border-radius:5px;">
          <h6 class="mb-1 text-primary">{{ book.title }}</h6>
          <p class="text-muted small" style="text-align:center;">{{ book.about }}</p>
        </div>
      </div>
    </div>
  `
})
export class HomeComponent {
  books: Book[] = [
    {
      title: 'Book 1',
      about: 'This is a great book about topic 1.',
      imgUrl: 'https://picsum.photos/seed/book1/100/150'
    },
    {
      title: 'Book 2',
      about: 'Learn about adventure and excitement in this book.',
      imgUrl: 'https://picsum.photos/seed/book2/100/150'
    },
    {
      title: 'Book 3',
      about: 'A classic tale of bravery.',
      imgUrl: 'https://picsum.photos/seed/book3/100/150'
    },
    {
      title: 'Book 4',
      about: 'History comes alive in these pages.',
      imgUrl: 'https://picsum.photos/seed/book4/100/150'
    },
    {
      title: 'Book 5',
      about: 'Learn practical skills for life.',
      imgUrl: 'https://picsum.photos/seed/book5/100/150'
    },
    {
      title: 'Book 6',
      about: 'An inspiring story of hope.',
      imgUrl: 'https://picsum.photos/seed/book6/100/150'
    },
    {
      title: 'Book 7',
      about: 'Discover new worlds in this sci-fi adventure.',
      imgUrl: 'https://picsum.photos/seed/book7/100/150'
    },
    {
      title: 'Book 8',
      about: 'A beautiful journey through poetry.',
      imgUrl: 'https://picsum.photos/seed/book8/100/150'
    },
    {
      title: 'Book 9',
      about: 'Heartwarming tales for everyone.',
      imgUrl: 'https://picsum.photos/seed/book9/100/150'
    },
    {
      title: 'Book 10',
      about: 'Learn the secrets of success.',
      imgUrl: 'https://picsum.photos/seed/book10/100/150'
    },
    {
      title: 'Book 11',
      about: 'Explore art and creativity.',
      imgUrl: 'https://picsum.photos/seed/book11/100/150'
    },
    {
      title: 'Book 12',
      about: 'Witty and humorous stories.',
      imgUrl: 'https://picsum.photos/seed/book12/100/150'
    },
    {
      title: 'Book 13',
      about: 'A science book for curious minds.',
      imgUrl: 'https://picsum.photos/seed/book13/100/150'
    },
    {
      title: 'Book 14',
      about: 'Myths and legends.',
      imgUrl: 'https://picsum.photos/seed/book14/100/150'
    },
    {
      title: 'Book 15',
      about: 'Lessons of great leaders.',
      imgUrl: 'https://picsum.photos/seed/book15/100/150'
    },
    {
      title: 'Book 16',
      about: 'Travel stories from around the world.',
      imgUrl: 'https://picsum.photos/seed/book16/100/150'
    },
    {
      title: 'Book 17',
      about: 'Unlock your imagination.',
      imgUrl: 'https://picsum.photos/seed/book17/100/150'
    },
    {
      title: 'Book 18',
      about: 'Children’s favorites.',
      imgUrl: 'https://picsum.photos/seed/book18/100/150'
    },
    {
      title: 'Book 19',
      about: 'A guide to healthy living.',
      imgUrl: 'https://picsum.photos/seed/book19/100/150'
    },
    {
      title: 'Book 20',
      about: 'Great adventures to enjoy.',
      imgUrl: 'https://picsum.photos/seed/book20/100/150'
    }
  ];
}
